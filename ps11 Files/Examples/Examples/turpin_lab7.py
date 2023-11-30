#!/usr/bin/python

#Elizabeth Turpin
#Lab 7
#High Priestess Chatbot - modified from--->
# Example of an Eliza-like chatbot,
# based on Tim Budd's example (pg. 82 of Exploring Python)

# This is just a template to show you how a chatbot
# might generate responses based on user input.
# Your lab should be a lot more complex (and hopefully closer to
# actual human speech patterns).
# The Loebner Prize is $100K + a cool medal...

import string
import random
import time

#Order of responses - Love, Past, Good, Lose, Marriage, Success, Perfection, Truth, Worry, Change, Ego. 
responses =[['You must learn to love others before you can experience true love for yourself.', 'To love is to recognize yourself in another.', 'Let yourself be silently drawn to the stronger pull of what you really love.', 'Love never dies a natural death. It dies because we do not know how to replenish its source.', 'Is it time to turn your heart into a temple of fire?','Love is a state of Being. Your love is not outside, it is deep within you. You can never lose it, and it cannot leave you.', 'Close the language door and open the love window.', 'Being deeply loved by someone gives you strength, while loving someone deeply gives you courage.', 'Do not regret how much you love, avoid those who repent thier passion.', 'Love is a madman, working his wild schemes, tearing off his clothes, and running through the mountains.'],

['The past has no power over the present moment.', 'The more you are focused on time, past and future, the more you miss the Now, the most precious thing there is.', 'The past is never where you think you left it.', 'It is more fun to think of the future than to dwell on the past.', 'What is the past? What we choose to remember.', 'How can I know anything about the past or future, when the light of the Beloved shines only now?'],

['Acknowledging the good you already have in your life is the foundation for all abundance.', 'The world is not split into good people and death eaters.', 'You do not become good by trying to be good, but by finding the goodness that is already within you, and allowing that goodness to emerge.', 'Hear blessings dropping their blossoms all around you.', 'No one knows what makes the soul wake up happy! Maybe a dawn breeze has blown the veil from the face of God.'],

['You can only lose something you have, you cannot lose something you are.', 'Anything you lose come back around in another form.', 'Smiles come best from those who weep.', 'Before death takes away what you are given, give away what thre is to give.', 'The hurt that we embrace becomes joy.'],

['Marriage is not for you.', 'Marriage can cause great amounts of stress in your life.', 'This love is the rose that blooms forever.', 'You will find the person who is wrong for you, in just the right way.', 'Become the sky.  Take an axe to the prison wall, escape.', 'Now is the time to unite the soul and the world.', 'Gamble everything for love, if you are a true human being.'],
['Try not to become a man of success. Rather become a man of value.', 'Who gets up early to discover the moment the light begins?', 'Why are you so enchanted with this world, when a mine of gold lies within you?', 'All you need in this life is ignorance and confidence, then success is sure.'],
['Have no fear of perfection... you will never reach it.', 'Very little grows on rock.  Be the crumbled ground, so wildflowers will come up where you are.', 'Purify your eyes and see the pure world.'],
['Truth is a beautiful and wonderful thing and should be treated with caution.', 'Believe those who are seeking the truth, doubt those who find it.', 'If you do not tell the truth about yourself you cannot tell it about other people.', 'Only the truth of who you are, if realized, will set you free.'],
['You are not pretty, you are not beautiful, you are radiant as the sun.', 'There is a morning inside you, waiting to burst open into the Light.'],
['The best way to find out if you can trust somebody is to trust them.', 'Is what I say true?', 'Keep walking, though there is no place to get. Do not try to see through the distances.', 'Move within, but don not move the way fear makes you move.', 'If all you can do is crawl, then start crawling.'],
['The truth does not always set you free, people prefer to believe prettier, neatley wrapped lies.', 'Lies require commitment.'],
['Worry pretends to be necessary, but serves to useful purpose.', 'Worry does not empty tomorrow of its sorrow, it empties today of its strength.', 'Worry is most often a prideful way of thinking that you have more control over life and its circumstances than you actually do.', 'Stop acting so small, You are the unverse in ecstatic motion.', 'As you start to walk out on the way, the way appears.', 'It is not time to worry yet.', 'If you are irritated by every rub, how will you be polished?'],
['Awareness is the greatest agent for change.', 'Times will change for the better when you change.', 'Why should I stay at the bottom of a well, when the rope is in my hands?', 'Everyone thinks of changing the world, few think of changing themselves.', 'The world is a process of out thinking, nothing can be changed with out changing our thinking.' ]] 


ego = ['The ego wants to want more than it wants to have.', 'Accept - then act. Whatever the present moment contains, accept it as if you had chosen it.', 'Stop defining yourself to others.', 'Shed your arrogance and become a seeker of hearts.']

misc =['Tell me a secret...', 'What the hell?', 'Sell your cleverness and buy bewilderment.', 'You were born with wings, why prefer to crawl through life?', 'What is your ultimate goal in life?', 'A secret freedom opens through a crevice you can barely see.', 'Not in a box, and not with a fox. Now let us talk about something else.', 'The breeze at dawn has secrets to tell you.  Do not go back to sleep.', 'Nothing is ever certain.', 'Out beyond the ideas or right and wrong, there is a field.  I will meet you there.', 'Anyone that believes what a cat tells him, deserves all he can get.', 'Maybe you should ask me something else?', 'Is there something from your past that bothers you?', 'Is there something in your life you feel is lacking?', 'Well, what do you think?', 'Let yourself become living poetry.']

silence = ['Ask me no questions, and I tell you no lies.', 'When you do not talk, there is a lot of stuff that ends up getting not said.']

#Keys Coordinate with Order of Responses

keys =[['love', 'loving', 'lover', 'loves', 'lovely','loved', 'like', 'likes', 'man', 'woman', 'sweetie', 'relationship'],
['past', 'future', 'coming', 'before', 'back', 'gone', 'former', 'forgotten', 'ago', 'finished', 'extinct', 'ended',' elapsed'],
['good', 'great', 'goodness', 'greatness', 'glory', 'glorious', 'magnificent'],
['lose', 'lost', 'obsolete', 'over', 'careless', 'misplace', 'fail', 'pass', 'loser', 'done', 'failed', 'losing', 'failing'],
['marry', 'marriage', 'wedding', 'married', 'engaged', 'engagement', 'marries', 'wed', 'wedded', 'wife', 'husband'],
['success', 'successful', 'succeed', 'sucess', 'sucessfull', 'suceed', 'luck', 'achieve', 'victory'],
['perfection', 'perfect', 'sublime', 'faultless', 'blameless', 'adept', 'amazing', 'amaze'],
['truth', 'honesty', 'honest', 'loyal', 'loyalty', 'fair', 'fairness', 'truthfull'],
['beauty', 'pretty', 'beautiful'],
['trust', 'trusting', 'trusted', 'trusts', 'upright', 'honor', 'integrity', 'assure', 'assurance', 'certain', 'certainty', 'rely', 'expect', 'expectations', 'expecting'],
['lies', 'lie', 'lying', 'lied', 'distortion', 'distort', 'deceit', 'decieve', 'deceive', 'fiction', 'false', 'detract', 'falseness', 'fraud', 'fib', 'inaccurate'],
['worry', 'worries', 'worried', 'worrying', 'torment', 'woe', 'disturb'],
['change', 'adjust', 'difference', 'refine', 'revolution', 'revision', 'shift', 'switch', 'variety', 'turn', 'remodel', 'remodeling', 'remodeled', 'modify', 'modified', 'modification', 'diverse', 'conversion', 'adjust', 'mutate']]

['want', 'need', 'get', 'desire', 'covet', 'craving', 'yern', 'wish', 'longing', 'require'],

score = []


def countKey(lst1, lst2):
    count = 0
    for elem in lst1:
      if elem in lst2:
        count+=1
    return count 

def getReply(line, words):
  # Find a reply based on the words

  #Check if Words is empty...
  if len(words) == 0: 
    answer = random.choice(silence)
    return answer
 
  #Check Words for I am...
  if words[0] == 'i' and words[1] == 'am':
    answer = random.choice(ego)
    return answer

  #Check if Words matches a Key Word
  max = 0
  maxnum = -1
  for num in range(len(keys)):
    score = countKey(words, keys[num])
    if score > max:
      max = score
      maxnum = num
  
  if maxnum != -1:
    getAnswer = responses[maxnum]
  else:
    getAnswer = misc

  
  answer = random.choice(getAnswer)
  return answer

 

#Start of the Program...
print 'Hello, I am the High Priestess, what is your name?'
name = raw_input()
print 'Type "quit" whenever you want to leave my presenece.'
time.sleep(1)
print 'If my words repeat themselves, then so does the spring.'
line = raw_input("So, "+name+", I am not a fortune teller, but I do have great wisdom on life, love, and happiness. What would you like to talk about?")

while line!="quit":
  line = line.lower()
  answer = getReply(line, line.split())
  time.sleep(1)
  print answer
  line = raw_input()
